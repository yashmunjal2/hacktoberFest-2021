// Normal
const bubbleSort = function(array) {
  let swaps;
  do {
    swaps = false;
    for (let i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        let temp = array[i + 1];
        array[i + 1] = array[i];
        array[i] = temp;
        swaps = true;
      }
    }
  } while (swaps);
  
  return array;
};

// Recursively
const bubbleSort = function (array, pointer = array.length - 1) {
  // Base Case
  if (pointer === 0) {
    return array;
  }

  for (let i = 0; i < pointer; i++) {
    if (array[i] > array[i + 1]) {
      let temp = array[i + 1];
      array[i + 1] = array[i];
      array[i] = temp;
    }
  }   
  // Recursive call on smaller portion of the array
  return bubbleSort(array, pointer - 1);  
};
