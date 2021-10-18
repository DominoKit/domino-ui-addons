[![Development Build Status](https://github.com/DominoKit/domino-ui-addons/actions/workflows/deploy.yaml/badge.svg?branch=development)](https://github.com/DominoKit/domino-ui-addons/actions/workflows/deploy.yaml/badge.svg?branch=development)
![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.dominokit/domino-ui-addons/badge.svg)
![Sonatype Nexus (Snapshots)](https://img.shields.io/badge/Snapshot-HEAD--SNAPSHOT-orange)

# Map extension for Domino-UI based on GWT-OL

With this addon you can simply integrate maps in your Domino-UI-based application.

## Project Setup

### Maven dependency

**Latest development**

```xml
<dependency>
  <groupId>org.dominokit</groupId>
  <artifactId>domino-ui-map-addon</artifactId>
  <version>HEAD-SNAPSHOT</version>
</dependency>
<dependency>
  <groupId>org.dominokit</groupId>
  <artifactId>domino-ui-map-addon</artifactId>
  <version>HEAD-SNAPSHOT</version>
  <classifier>sources</classifier>
</dependency>

```

**Latest release**

```xml
<dependency>
  <groupId>org.dominokit</groupId>
  <artifactId>domino-ui-map-addon</artifactId>
  <version>1.0.0-RC1</version>
</dependency>
<dependency>
  <groupId>org.dominokit</groupId>
  <artifactId>domino-ui-map-addon</artifactId>
  <version>1.0.0-RC1</version>
  <classifier>sources</classifier>
</dependency>

```


### Resources

```html
<link href="//cdn.rawgit.com/openlayers/openlayers.github.io/master/en/v[x.x.x]/css/ol.css" rel="stylesheet" type="text/css">
<script src="//cdn.rawgit.com/openlayers/openlayers.github.io/master/en/v[x.x.x]/build/ol.js" type="text/javascript"></script>
```
Replace `[x.x.x]` with the [OpenLayers](http://openlayers.org/ "OpenLayers website") version you want to use.

### GWT Module XML

Add the following snippet to your .gwt.xml file:
```xml
<inherits name='org.dominokit.addons.ol.OLMapAddon'/>
```

## Demo application

This [demo](https://github.com/TDesjardins/domino-map-demo) represents a basic sample application with domino-ui-ol-addon usage. 
