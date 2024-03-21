//expressao de funcao

// o JS antes de fazer qualquer coisa no código, ele lista tudo. Funções e Var são "listadas" no topo do codigo

console.log(apresentar())

function apresentar(){
    return "olá";
}

//vai dar erro pois está declarado depois
console.log(soma(1,1))
const soma = function(num1,num2){
    return num1 + num2 }