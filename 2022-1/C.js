var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split(' ');
var N = parseInt(input[0]);
var str = input[1];
var countW = 0;
var countE = 0;
var S = new Array();
for(var idx=0;idx<N;idx++){
  if(str.substr(idx,1)=="E"){
    countE++;
  }
  S.push(str.substr(idx,1))
}

var result = 0;
for(var i=0;i<N;i++){
  var count = 0;
  if(S[i]=="W"){
    countW++;
  }else if(S[i]=="H"){
    count = countW * (Math.pow(2,countE) - countE - 1);
  }else if(S[i]=="E"){
    countE--;
  }
  result += count%1000000007;
}
console.log(result)