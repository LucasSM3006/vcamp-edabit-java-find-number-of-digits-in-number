function num_of_digits(num) {
    if(num == 0) return 1;

    //If negative
    if(num < 0) {
        return findNumOfDigits(num);
    }
    
    //If positive
    var lengthOfInteger = Math.floor(Math.log10(num) + 1);
    return lengthOfInteger;
}

function findNumOfDigits(num) {
    var stringLength = num.toString().length - 1;
    return stringLength;
}