const input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

const [comp, dist] = input[0].split('\s').forEach((num, i) => input[0][i] = parseInt(num));

const [custo, valor] = input[1].split('\s').forEach((num, i) => input[1][i] = parseInt(num));

const pedagios = Math.floor(comp/dist) * valor;

const gasolina = custo * comp;

console.log(pedagios + gasolina);