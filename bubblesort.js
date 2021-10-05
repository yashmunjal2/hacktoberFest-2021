
function bubbleSort(arr,n){
    for (let i = 0; i < n-1; i++){
      // last i elements are already at the correct position  
      for (let j = 0; j < n-i-1; j++){
        if (arr[j] > arr[j+1]){
          // swap arr[j], arr[j+1]  
          let temp = arr[j]
          arr[j] = arr[j+1]
          arr[j+1] = temp
        }
      }
    }
  }
  
  function printArray(arr){
    console.log(arr.join(' '))
  }
  
  function main(){
    let arr = [6, 3, 8, 9, 5]
    let n = arr.length
  
    console.log("Given Array: ")
    printArray(arr)
  
    bubbleSort(arr, n)
  
    console.log("Sorted Array: ")
    printArray(arr, n)
  }
  
  main()