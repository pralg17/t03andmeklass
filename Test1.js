const words = require("./laadur")

const Words = new words('./words.txt');

setTimeout(()=> {
    //Allowing for some time for the file to be read in..
    console.log(Words.serveOne());
    //kunstkäsitöö
    console.log(Words.serveOne(5));
    //tiool
    console.log(Words.serveMultiple(10));
    //     [ 'õpilaskodu',
    //   'pöördtrükk',
    //   'vattpüksid',
    //   'kahtlevalt',
    //   'ebasarikas',
    //   'malelahing',
    //   'suitsusiig',
    //   'hõbeseekel',
    //   'tööandmine',
    //   'sülemikulp' ]
    console.log(Words.serveMultiple(5,5));
    //[ 'drill', 'tõlge', 'põnks', 'rauas', 'servo' ]

}, 1000)
