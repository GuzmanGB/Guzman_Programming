let nota1 = parseFloat(prompt("Introduce nota de examen 1"))
let nota2 = parseFloat(prompt("Introduce nota de examen 2"))
let nota3 = parseFloat(prompt("Introduce nota de examen 3"))



var media = (nota1 + nota2 + nota3) / 3

console.log("Nota del primer examen: " + nota1)
console.log("Nota del segundo examen: " + nota2)
console.log("Nota del tercer examen: " + nota3)

console.log("La media de estas notas son: " + media)


if (media < 5) {
    console.log("Suspendido")
}

else if (media >= 5 && media < 7) {
    console.log("Aprovado")
}

else if (media >= 7 && media < 9) {
    console.log("Notable")
}

else if (media >= 9 && media <= 10) {
    console.log("Excelente")
}