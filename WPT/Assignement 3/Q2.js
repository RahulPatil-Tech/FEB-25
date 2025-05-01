function forEachElement(arr, callback) {
    for (let i = 0; i < arr.length; i++) {
      callback(arr[i], i);
    }
  }
  
  // Example usage:
  const numbers = [1, 2, 3, 4, 5];
  forEachElement(numbers, function(number, index) {
    const result = number * 2;
    console.log(`Index ${index}: ${number} * 2 = ${result}`);
  });