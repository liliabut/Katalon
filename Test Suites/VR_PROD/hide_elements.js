// WC15 ausblenden no-teaser weißer Raum
var element = document.getElementsByClassName('no-teaser')[0]; if (element !== 'undefined' && element !== null && !!element) {element.classList.remove('no-teaser');}

// slider in footer
var element = document.getElementsByClassName('megafooter-inner-full')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// sticky blue window on right side
var element = document.getElementsByClassName('localisation-sticky')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// hide element logo meine bank
var element = document.getElementsByClassName('logo-meine-bank__wrapper')[0]; if (element !== 'undefined' && element !== null && !!element) {element.style.display = 'none';}

// remove/delete element seiten anfang button
var element = document.getElementsByClassName('top-link')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

var element = document.getElementsByClassName('campaign-area')[0]; if (element !== 'undefined' && element !== null && !!element) {element.style.display = 'none';}
//var element = document.getElementsByClassName('module-carousel')[0]; if (element !== 'undefined' && element !== null && !!element) {element.style.display = 'none';}

var element = document.getElementsByClassName('module stickynav')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

var element = document.getElementsByClassName('module module-external ym-clearfix')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// youtube player
// var element = document.getElementById('player'); if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// remove all players
// var element = document.querySelectorAll('[id=player]'); if (element !== 'undefined' && element !== null && !!element) {element.forEach(function(e, index, array) {e.parentNode.removeChild(e);})}

// remove all iframes
var element = document.querySelectorAll('iframe'); if (element !== 'undefined' && element !== null && !!element) {element.forEach(function(e, index, array) {e.parentNode.removeChild(e);})}

// remove videoportal player
// var element = document.getElementsByClassName('module-videoplayer__inner')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// close overlay "ja"/"nein" window
var element = document.getElementsByClassName('vvClose')[0]; if (element !== 'undefined' && element !== null && !!element) {element.click();}

// map
// var element = document.getElementsByClassName('gm-style')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}
// var element = document.getElementsByClassName('map-area')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// komplixiertes map
// var element = document.getElementsByClassName('map-wrapper')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}