const notas = [10, 6.5, 8, 7.5];

let somaDasNotas = 0;

//a função anonima foi passada como devolta(callback) de outra
// notas.forEach(function (){
//     console.log('oi');
// });

notas.forEach(function(nota){
    somaDasNotas += nota;
});

const media = somaDasNotas/notas.length;

console.log(`A media das notas é ${media}`);