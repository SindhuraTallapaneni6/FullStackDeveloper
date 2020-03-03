package com.cts.training.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.userservice.RegisterRepo;

import com.cts.training.userservice.Register;
import com.cts.training.userservice.RegisterService;

@RestController
@CrossOrigin(origins="*")
public class RegisterController {
	@Autowired
	RegisterRepo registerRepo;
	@Autowired
	RegisterService registerService;
	@Autowired
	JavaMailSender javaMailSender;
	@RequestMapping(value="/register", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Register> findAll(){
		return registerRepo.findAll();
	}
	@RequestMapping(value="/register/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Register findone(@PathVariable int id)
	{
	   Optional<Register> reg = registerRepo.findById(id);
	   Register r = reg.get();
	   return r;
	}
	@RequestMapping(value="/register", method= RequestMethod.POST)
	public String save(@RequestBody Register reg) {
//		RegisterDTO user;
		String usermail;
		usermail=registerService.addUser(reg);
		return usermail;
//		try {
//			SimpleMailMessage sm = new SimpleMailMessage();
//			sm.setFrom("tanusreevidya13@gmail.com");
//			sm.setTo(reg.getEmail());
//			usermail=reg.getEmail();
//			if(rr.findByEmail(usermail)!= null) {
//				return "{\"res\":\"0\"}";
//			}
//			else {
//				user=rs.insert(reg);
//			sm.setSubject("testing mail...");
//			sm.setText("Account created click on 'http://localhost:4200/activate?" + user.getEmail()
//					+ "'");
//			jms.send(sm);
////			sm.setText("Account created click on <a href='http://localhost:4200/registerUser/activate?'>Click</a>");
////			jms.send(sm);			
//			System.out.println("sending mail...");
//			return "{\"res\":\"1\"}";
//		}
//		}catch (Exception e) {
//			e.printStackTrace();
//			return "{\"res\":\"2\"}";
//		}
	}
////	public ResponseEntity<RegisterDTO> save(@RequestBody RegisterDTO reg)
////	{
////		rs.insert(reg);
////		return new ResponseEntity<RegisterDTO>(reg,HttpStatus.CREATED);		
////	}
////	public Register save(@RequestBody Register reg){
////		Register register = rr.save(reg);
////		
////		try {
////			SimpleMailMessage sm = new SimpleMailMessage();
////			sm.setFrom("tanusreevidya13@gmail.com");
////			sm.setTo("tanusreevidya13@gmail.com");
////			sm.setSubject("testing mail...");
////			sm.setText("Account created click on <a href='http://localhost:4200/activate?"+register.getEmail()+"'>Click</a>");
////			jms.send(sm);
////			System.out.println("sending mail...");
////		}
////		catch (Exception e){
////			e.printStackTrace();
////		}
//////		return "{\"reg\":\"ok\"}";
////		register.setActive("yes");
////		return register;
////		}
//
	@RequestMapping(value="/register/{id}", method= RequestMethod.DELETE)
	public void  deleteUser(@PathVariable int id){
		registerRepo.deleteById(id);
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.PUT)
	public Register update(@RequestBody Register reg) {
	Register user = registerService.updateUser(reg);
	return user;
	}

	@RequestMapping(value="/activate",method= RequestMethod.PUT)
	public Register activate(@RequestBody String email)
	{
		String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
		System.out.println("email ::"+str);
		Register u=	registerRepo.findByEmail(str);
		System.out.println("uname :"+u.getUsername());
		u.setActive("yes");
		Register register = registerRepo.save(u);
	    return register;
	    
	}
	
	

}
