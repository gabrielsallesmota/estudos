//boolean
const usuarioLogado = true
const contapaga = false

//truthy or falsy
    // 0 => false
    // 1 => true

console.log(0 == false)
console.log("" == false) //entre strings vazias o JS considera como false
console.log(1 == true)

//undefined

//null => vazio ou nada
let minhaVar;
let varNull = null;

console.log(minhaVar)
console.log(varNull)

let numero = 3;
let texto = "Alura";

console.log(typeof numero) //typeof é palavra chave pra perguntar para o JS qual é o tipo da variável
console.log(typeof texto)
console.log(typeof minhaVar)
console.log(typeof varNull)