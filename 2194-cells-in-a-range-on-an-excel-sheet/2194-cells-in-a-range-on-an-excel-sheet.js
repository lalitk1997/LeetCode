/**
 * @param {string} s
 * @return {string[]}
 */
var cellsInRange = function(s) {
    let arr = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
              'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
    let startAlpha = s[0];
    let endAlpha = s[3];
    // console.log(startAlpha, endAlpha);
    let startNum = s[1];
    let endNum = s[4];
    // console.log(startNum, endNum);
    
    let countAlpha = 0;
    let temp1 = 0;
    let temp2 = 0
    for(let i=0; i<arr.length; i++){
        if(arr[i] === startAlpha){
            temp1 = i;
        }
        if(arr[i] === endAlpha){
            temp2 = i;
        }
    }
    countAlpha = temp2-temp1;
    // console.log(countAlpha);
    
    let tempMin = s[1];
    let tempMax = s[4];
    // console.log(tempMin, tempMax);
    // console.log(temp1, temp2);
    let resultArr = [];
    // console.log(countAlpha);
    // console.log(temp1, temp2);
    if(countAlpha === 0){
        //console.log("Working");
        let val = tempMin;
        while(val <= tempMax){
            let bag = arr[temp1]+val;
            // console.log(arr[temp1]);
            val++;
            resultArr.push(bag);
        }
        return resultArr;
    }
    
    for(let i=temp1; i<=temp2; i++){
        let val = tempMin;
        while(val <= tempMax){
            let bag = arr[i]+val;
            val++;
            resultArr.push(bag);
        }
    }
    console.log(resultArr);
    return resultArr;
};