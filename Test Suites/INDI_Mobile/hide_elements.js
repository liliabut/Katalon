// sliders: remove ALL event listeners
//var e = document.getElementById('main-content'), ec = e.cloneNode(true); e.parentNode.replaceChild(ec, e);
//var e = document.getElementById('allinone_thumbnailsBanner_photoText2'); e.style.display='none';
//var e = document.getElementById('allinone_thumbnailsBanner_photoText1'); e.style.display='block';

// for flessabank, bbbank, evangelische bank
var e = document.getElementsByClassName('module-carousel')[0]; if (e !== 'undefined' && e !== null && !!e) {var ec = e.cloneNode(true); var par = e.parentNode; par.removeChild(e); par.appendChild(ec); es = document.getElementsByClassName('section-teaser'); var i = 1; while (i < es.length) {es[i].parentNode.removeChild(es[i]); i++;}; es[0].classList.add('is-current');}
var e = document.getElementsByClassName('carousel-nav__text')[0]; if (e !== 'undefined' && e !== null && !!e) {var str = e.innerHTML.split('/'); e.innerHTML = '1/' + str[1];}
var es = document.getElementsByClassName('carousel-dotnav__item'); if (es !== 'undefined' && es !== null && !!es && es.length > 0) {var i = 0; while(i < es.length) {es[i].classList.remove('is-active'); i++;}; es[0].classList.add('is-active');}

// for VR
//var e = document.getElementsByClassName('module-carousel')[0]; if (e !== 'undefined' && e !== null && !!e) {var ec = e.cloneNode(true); var par = e.parentNode; e.parentNode.removeChild(e); par.appendChild(ec); var el = par.getElementsByClassName('carousel-wrapper')[0]; while (el.childNodes.length > 1) {el.removeChild(el.lastChild);} el.lastChild.style.opacity=1; el = par.getElementsByClassName('pagination')[0]; var i = 0; while (i < el.childNodes.length) {el.childNodes[i].classList.remove('active'); i++;} el.firstChild.classList.add('active');}

//var e = document.getElementsByClassName('module-carousel')[0]; var p = document.getElementsByClassName('pagination')[0]; if (e !== 'undefined' && e !== null && !!e && p !== 'undefined' && p !== null && !!p) {var ec = e.cloneNode(true); var par = e.parentNode; e.parentNode.removeChild(e); par.appendChild(ec); var el = par.getElementsByClassName('carousel-wrapper')[0]; while (el.childNodes.length > 1) {el.removeChild(el.lastChild);} el.lastChild.style.opacity=1; el = par.getElementsByClassName('pagination')[0]; var i = 0; while (i < el.childNodes.length) {el.childNodes[i].classList.remove('active'); i++;} el.firstChild.classList.add('active');}

var e = document.getElementsByClassName('module-carousel')[0]; var p = document.getElementsByClassName('pagination')[0]; var s = document.getElementsByClassName('section-teaser'); if (e !== 'undefined' && e !== null && !!e && p !== 'undefined' && p !== null && !!p && s !== 'undefined' && s !== null && !!s && s.length > 1) {var ec = e.cloneNode(true); var par = e.parentNode; e.parentNode.removeChild(e); par.appendChild(ec); var el = par.getElementsByClassName('carousel-wrapper')[0]; while (el.childNodes.length > 1) {el.removeChild(el.lastChild);} el.lastChild.style.opacity=1; el = par.getElementsByClassName('pagination')[0]; var i = 0; while (i < el.childNodes.length) {el.childNodes[i].classList.remove('active'); i++;} el.firstChild.classList.add('active');}


// for Volksbank
var e = document.getElementsByClassName('module-sliderthumbs')[0]; if (e !== 'undefined' && e !== null && !!e) {var ec = e.cloneNode(true); var par = e.parentNode; e.parentNode.removeChild(e); par.appendChild(ec); var el = document.getElementById('allinone_thumbnailsBanner_simple'); while (el.childNodes.length > 1) {el.removeChild(el.lastChild);} el.lastChild.style.display='block'; el = par.getElementsByClassName('thumbsHolder')[0]; var i = 0; while (i < el.childNodes.length) {el.childNodes[i].classList.remove('thumbsHolder_ThumbON'); i++;} el.firstChild.classList.add('thumbsHolder_ThumbON');}


// ------------------------------ //

// BBBank
// Marginalspalte dynamischer banner
//var element = document.getElementById('inlineMedia'); if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// Prototyp/INDI

//var element = document.getElementsByClassName('acc-content')[0]; if (element !== 'undefined' && element !== null && !!element) {var element2; do {element2 = document.getElementsByClassName('acc-content active')[0];} while(element === 'undefined');}

// Campagne Slider
// var element = document.getElementsByClassName('module module-carousel   has-transition-fade')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}


// remove/delete element externer Inhalt
var element = document.getElementsByClassName('module module-teaser module-external ym-clearfix')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}



// remove/delete element seiten anfang button
var element = document.getElementsByClassName('top-link is-visible')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// remove/delete stickynav
//var element = document.getElementsByClassName('module stickynav')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// remove/delete cookie-layer
//var element = document.getElementsByClassName('cookie-layer__inner')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}
//

// remove/delete Kontakt (Marginalspalte)
//var element = document.getElementById('secondary-page-area'); if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// remove/delete user like button
//var element = document.getElementById('userlike-tab'); if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}


// ------------------ VR und gasf
// slider in footer
//var element = document.getElementsByClassName('megafooter-slider')[0]; if (element !== 'undefined' && element !== null && !!element) {element.style.display = 'none';}
//var element = document.getElementsByClassName('megafooter-slider')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}
//var element = document.getElementsByClassName('megafooter-inner-full')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

//var element = document.getElementById('header'); if (element !== 'undefined' && element !== null && !!element) {element.style.display = 'none';}

// sticky blue window on right side
//var element = document.getElementsByClassName('localisation-sticky')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// hide element logo meine bank
var element = document.getElementsByClassName('logo-meine-bank__wrapper')[0]; if (element !== 'undefined' && element !== null && !!element) {element.style.display = 'none';}

// remove/delete element seiten anfang button
var element = document.getElementsByClassName('top-link')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// var element = document.getElementsByClassName('campaign-area')[0]; if (element !== 'undefined' && element !== null && !!element) {element.style.display = 'none';}
//var element = document.getElementsByClassName('module-carousel')[0]; if (element !== 'undefined' && element !== null && !!element) {element.style.display = 'none';}

//var element = document.getElementsByClassName('module stickynav')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

//var element = document.getElementsByClassName('module module-external ym-clearfix')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

//var element = document.getElementsByClassName('layout-wrapper account-change omnikanal-nav-target')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

//var element = document.getElementsByClassName('layout-wrapper profibroker omnikanal-nav-target')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// youtube player
//var element = document.getElementById('player'); if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// remove all players
//var element = document.querySelectorAll('[id=player]'); if (element !== 'undefined' && element !== null && !!element) {element.forEach(function(e, index, array) {e.parentNode.removeChild(e);})}

// remove all iframes
//var element = document.querySelectorAll('iframe'); if (element !== 'undefined' && element !== null && !!element) {element.forEach(function(e, index, array) {e.parentNode.removeChild(e);})}

// remove videoportal player
//var element = document.getElementsByClassName('module-videoplayer__inner')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// close overlay "ja"/"nein" window
//var element = document.getElementsByClassName('vvClose')[0]; if (element !== 'undefined' && element !== null && !!element) {element.click();}

// map
//var element = document.getElementsByClassName('gm-style')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}
//var element = document.getElementsByClassName('map-area')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}

// komplixiertes map
//var element = document.getElementsByClassName('map-wrapper')[0]; if (element !== 'undefined' && element !== null && !!element) {element.parentNode.removeChild(element);}