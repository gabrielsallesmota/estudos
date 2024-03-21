//tipo de dado
//booleanos

//conversao implícita
const numero = 456;
const numeroString = "456";

console.log(numero === numeroString) //=== compara o valor e o tipo
console.log(numero == numeroString) //== compara só o valor

console.log(numero+numeroString) //ele concatena os valores e torna em String


//conversao explícita

//Number()
console.log(numero+Number(numeroString)) //converte o valor da string antes do JS tentar fazer algo
//String()
console.log(String(numero)+numeroString) //converte number para string 