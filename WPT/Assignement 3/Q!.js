function toUpperCase(str) {
    const upperCaseString = str.toUpperCase();
    console.log("Uppercase string:", upperCaseString);
    return upperCaseString;
  }
  
  function processData(inputString, callback) {
    console.log("Processing data:", inputString);
    callback(inputString);
  }
  
  // Example usage:
  const myString = "hello world";
  processData(myString, toUpperCase);