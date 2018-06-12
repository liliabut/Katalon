<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>tracking2</name>
   <tag></tag>
   <elementGuidId>c21d6d21-c990-46c6-a609-a09c14736993</elementGuidId>
   <selectorCollection>
      <entry>
         <key>BASIC</key>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//script[@type=&quot;text/javascript&quot; and contains(text(), &quot;// Add hidden field on each form to track them
( function() {
	var formElements = document.getElementsByTagName( 'form' ),
		input = document.createElement( 'input' ),
		i;

	input.type = 'hidden';
	input.name = 'wt_form';
	input.value = '1';

	for ( i = 0; i &lt; formElements.length; i++ ) {
		formElements[ i ].insertBefore( input.cloneNode( true ), formElements[ i ].firstChild );
	}
} )();

/**
 * Page specific webtrekk configuration
 * for global configuration, take a look into the webtrekk_vX JS
 */
var webtrekkPageConfig = {
		contentId: '',	// Generiert eine automatische Content ID aus der URL
		linkTrack: 'link', // Aktiviert das Linktracking [link oder standard]
		linkTrackAttribute: 'title',
		heatmap: '0',	// Deaktiviert das Heatmap-Tracking
		form: '1',	// Aktiviert das Formular-Tracking: Funktioniert nur, wenn Formulare auch markiert sind.
		execCDB: false,
		execRTA: false
	},
	wt;

// Add heatmap tracking only on pages with &quot;landingpage&quot; body class
( function() {
	if ( ogr.hasClass( document.body, 'heatmap' ) ) {
		webtrekkPageConfig.heatmap = '1';

		var ymWrapper = document.querySelector( '.ym-wrapper' );

		// Add heatmap ref point
		if ( ymWrapper ) {
			ymWrapper.setAttribute( 'id', 'wt_refpoint' );
		}
	}
} )();

// Initialize webtrekk tracking
if ( typeof webtrekkV3 === 'function' ) {
	wt = new webtrekkV3( webtrekkPageConfig );
	wt.sendinfo();
}&quot;)]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
</WebElementEntity>
