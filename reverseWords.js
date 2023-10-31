

//Note- Paste whole code at once in browser console to test
let sentence = prompt("Enter the sentence")
let word=""
let newSentence=""

function reverseWord(word){
    let reversedWord=""
    for(let j=0;j<word.length();j++){
        reversedWord=word.charAt(j)+reversedWord
    }
    return reversedWord
}

for(let i=0; i<sentence.length(); i++){
    if(sentence.charAt(i)===" " && word){ //word is not null or not ""
        newSentence+=reverseWord(word)+" "
        word=""
        continue
    }
    else if(sentence.charAt(i)===" " && !word){
        continue
    }
    word+=sentence.charAt(i)
}
newSentence+=reverseWord(word)


