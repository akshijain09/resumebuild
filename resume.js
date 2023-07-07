function generateCV() {
  console.log("generating CV");
 /*let nameField = document.getElementById("nameField").value;
 
 let nameT1=document.getElementById("nameT1"); 
 nameT1.innerHTML = nameField;

 document.getElementById("nameT2").innerHTML = nameField;*/

 document.getElementById("nameT").innerHTML = document.getElementById("nameField").value;
  



 document.getElementById("cT").innerHTML = document.getElementById("contactField").value;

 document.getElementById("locT").innerHTML = document.getElementById("addField").value;

 document.getElementById("lT").innerHTML = document.getElementById("linkedField").value;
 document.getElementById("eT").innerHTML = document.getElementById("gmailField").value;

 document.getElementById("uT").innerHTML = document.getElementById("iField").value;
 document.getElementById("pT").innerHTML = document.getElementById("pField").value;
 document.getElementById("dT").innerHTML = document.getElementById("dField").value;

 document.getElementById("sT").innerHTML = document.getElementById("sField").value;
 document.getElementById("paT").innerHTML = document.getElementById("paField").value;
 document.getElementById("daT").innerHTML = document.getElementById("daField").value;

 document.getElementById("oT").innerHTML = document.getElementById("psField").value;

document.getElementById("coT").innerHTML = document.getElementById("coField").value;
document.getElementById("rT").innerHTML = document.getElementById("rField").value;
document.getElementById("kT").innerHTML = document.getElementById("kField").value;

document.getElementById("co1T").innerHTML = document.getElementById("co1Field").value;
document.getElementById("r1T").innerHTML = document.getElementById("r1Field").value;
document.getElementById("k1T").innerHTML = document.getElementById("k1Field").value;

document.getElementById("skT").innerHTML = document.getElementById("skField").value;
document.getElementById("plT").innerHTML = document.getElementById("plField").value;




 


 document.getElementById("form").style.display='none';
 document.getElementById("cvtemplate").style.display='none';

 
}

function printCV() {
  window.print();
  
}

