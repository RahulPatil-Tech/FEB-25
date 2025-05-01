function fetchData(url, callback) {
    console.log(`Fetching data from: ${url}`);
    setTimeout(function() {
      const response = "Simulated response data";
      console.log("After delay...");
      callback(response);
    }, 2000); // Simulate a 2-second delay
  }
  
  // Example usage:
  const dataUrl = "https://example.com/api/data";
  fetchData(dataUrl, function(data) {
    console.log("Response:", data);
  });