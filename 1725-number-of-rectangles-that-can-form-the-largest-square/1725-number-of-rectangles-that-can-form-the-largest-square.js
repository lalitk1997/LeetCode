/**
 * @param {number[][]} rectangles
 * @return {number}
 */
var countGoodRectangles = function(rectangles) {
    // console.log(rectangles);
    for(let i=0; i<rectangles.length; i++){
        if(rectangles[i][0] > rectangles[i][1]){
            rectangles[i][0] = rectangles[i][1];
        }else{
            rectangles[i][1] = rectangles[i][0];
        }
    }
    let obj = {};
    let max = -1;
    for(let i=0; i<rectangles.length; i++){
        if(rectangles[i][0] > max){
            max = rectangles[i][0];
            // console.log(max+"-");
        }
        if(obj[rectangles[i][0]] === undefined){
            obj[rectangles[i][0]] = 1;
        }else{
            obj[rectangles[i][0]]++;
        }
    }
    console.log(max);
    console.log(obj);
    for(key in obj){
        if(max == key){
            return obj[key];
            
        }
    }
};