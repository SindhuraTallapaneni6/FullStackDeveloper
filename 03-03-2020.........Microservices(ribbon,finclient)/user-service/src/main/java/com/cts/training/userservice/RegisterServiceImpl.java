package com.cts.training.userservice;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//import javax.websocket.server.ServerEndpoint;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.cts.training.userservice.RegisterDTO;
import com.cts.training.userservice.Register;
import com.cts.training.userservice.RegisterRepo;
import com.cts.training.userservice.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	RegisterRepo registerRepo;
	@Autowired
	JavaMailSender javaMailSender;
	
	@Override
	public String addUser(Register registerDTO) {
		Register reg=new Register();
		String mail;
		try {
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setFrom("sindhura200698@gmail.com");
			simpleMailMessage.setTo(registerDTO.getEmail());
			mail=registerDTO.getEmail();
			if(registerRepo.findByEmail(mail)!= null) {
				return "{\"res\":\"0\"}";
			}
			else {
				BeanUtils.copyProperties(registerDTO, reg);
				registerRepo.save(reg);
				simpleMailMessage.setSubject("Activation Mail");
				simpleMailMessage.setText("Account Created Click on 'http://localhost:4200/activate?"+reg.getEmail()+"'");
				javaMailSender.send(simpleMailMessage);
				System.out.println("Sending Mail.........");
				return "{\"res\":\"1\"}";
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return "{\"res\":\"2\"}";
		}
	}
	@Override
	public List<Register> getAllUsers(){
		List<Register> entities = registerRepo.findAll();
		List<Register> usersDTO = new ArrayList<Register>();
		for(Register entity: entities) {
			Register userDTO = new Register();
			BeanUtils.copyProperties(entity, userDTO);
			usersDTO.add(userDTO);
		}
		System.out.println("Entity: "+entities);
		System.out.println("DTO: "+usersDTO);
		return usersDTO;
	}
	@Override
	public void deleteUser(int id) {
		registerRepo.deleteById(id);
	}
	@Override
	public Register getUserById(int id){
		Optional<Register> users = registerRepo.findById(id);
		Register registerDTO = new Register();
		BeanUtils.copyProperties(users.orElse(new Register()), registerDTO);
		return registerDTO;
	}
//
//	@Override
//	public RegisterDTO getById(int id) {
//		//Register reg=user.findById(id)
//		
//		return null;
//	}
//	@Override
//	public boolean activateUser(String email) {
//		System.out.println(email);
//		Register users = user.findByEmail(email).get();
//		System.out.println(users);
//		if(!users.isConfirmed()) {
//			System.out.println(users);
//			users.setConfirmed(true);
//			user.save(users);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	@Override
	public Register updateUser(Register registerDTO) {
		Register reg = new Register();
		BeanUtils.copyProperties(registerDTO, reg);
		registerRepo.save(reg);
		return registerDTO;
	}
	
}