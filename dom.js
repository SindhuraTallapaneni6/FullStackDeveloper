// var firstDiv = document.querySelector('div');
// firstDiv.style.color = 'red';

// var paragraphs = document.querySelectorAll('p');
// for(var p of paragraphs)
//   p.style.color = 'blue';

//  var btn = document.querySelector('button');
// //  btn.addEventListener('click',foo);
// btn.onclick=foo;
// function foo() { alert('hello'); }

// btn.removeEventListener('click',foo);

// var div = document.querySelector('div');
// var strong = document.createElement('sindhu');
// strong.textContent = 'Hello';
// div.appendChild(strong);

//replace child

// var emm = document.createElement('emm');
// var strong = document.querySelector('strong');
// var div = document.querySelector('div');
// emm.textContent = 'hi';
// div.replaceChild(emm, strong);

//clone node
// var strong = document.querySelector('strong');
// var copyy = strong.cloneNode(true);
// var div = document.querySelector('div');
// div.appendChild(copyy);

//insertBefore
// var emm = document.createElement('emm');
// var strong = document.querySelector('strong');
// var div = document.querySelector('div');
// emm.textContent = 'hi';
// div.insertBefore(emm, strong);

// var table = document.querySelector("table");
// var df = document.createDocumentFragment();
 
// for(var i=0; i<5; i++) {
//   var td = document.createElement("td");
//   var tr = document.createElement("tr");
//   td.textContent = i;
//   tr.appendChild(td)
//   df.appendChild(tr);
// }
 
// table.appendChild(df);

// var style = getComputedStyle(document.querySelector('div'));
// alert(style.width);


//setAtrribute
// var div = document.querySelector('div');
// div.setAttribute('contenteditable', '')

//getAttribute
// var div = document.querySelector('div');
// alert(div.getAttribute('contenteditable'))

// removeAttribute
var div = document.querySelector('div');
div.removeAttribute('contenteditable');