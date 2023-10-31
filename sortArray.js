//Note- Paste whole code at once in browser console to test
let arr=[4,8,0,-1,2,3,4,4,6]

for(let i=0;i<arr.length-1;i++){
    for(let j=arr.length-1;j>i;j--){
        if(arr[j]>arr[j-1]){
            let temp=arr[j]
            arr[j]=arr[j-1]
            arr[j-1]=temp
        }
    }
}
console.log(arr)