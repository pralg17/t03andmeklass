const path = require("path");
module.exports = class Words {
    /**
     * @param {String} filename
     * @return {Array} Returns a sorted array of words
     */
    constructor(filename) {
        this.pool = [];
        let lr = require('readline').createInterface({
            input: require('fs').createReadStream(path.resolve(__dirname, filename))
        });
        lr.on('line', (line)=>{
            let charCount = line.length;
            if (!this.pool[charCount]){
                this.pool[charCount] = [];
            }
            this.pool[charCount].push(line);
        });
    }
    /**
     * @param {Number} wordlength Desired word length
     * @return {String} Returns a random word of chosen || random length.
     */
    serveOne(wordlength) {
        let length = wordlength ? wordlength : Math.floor(Math.random()*this.pool.length);
        let available = this.pool[length].length;
        return this.pool[length][Math.floor(Math.random()*available)];
    }

    /**
     * @param {Number} wordcount word count
     * @param {Number} wordlength Desired word length
     * @return {Array} Returns an array of words in the specified || random length.
     */
    serveMultiple(wordcount, wordlength) {
        let returnables = [];
        for(let i=0; i<wordcount;i++) {
            returnables.push(this.serveOne(wordlength))
        }
        return returnables
    }
}

