function gerarMatricula(){
	var txt = "ACA";
//	Gerando um numero qualquer JS
	var aleatorio = Math.floor(Math.random() * 1500);
	document.getElementById('matricula').value = (txt + aleatorio);
}

