/**
 * @param {number[][]} image
 * @return {number[][]}
 */
var flipAndInvertImage = function(image) {
    let arr = [];
    for(let i=0; i<image.length; i++){
        let bag = '';
        // for(let j=0; j<image[i].length; i++){
        for(let j=image[i].length-1; j>=0; j--){
            // arr[i][(image[i].length-1)-j] = image[i][j];   
            bag = bag + image[i][j];
        }
        let temp = bag.split("");
        // console.log(temp);
        arr.push(temp);
    }
    for(let i=0; i<arr.length; i++){
        for(let j=0; j<arr[i].length; j++){
            if(arr[i][j] == 1){
                arr[i][j] = 0;
            }else{
                arr[i][j] = 1;
            }
        }
    }
    return arr
};