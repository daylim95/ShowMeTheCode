var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split(' ');
var N = parseInt(input[0]);
var Q = parseInt(input[1]);

var house = new Array();
for(var i=0;i<N-1;i++){
  house.push(input[i+2])
}

var tree = new Array();



var string = ""

console.log(parseInt)