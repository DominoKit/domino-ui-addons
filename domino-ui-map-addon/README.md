# Map extension for Domino-UI based on GWT-OL

With this addon you can simply integrate maps in your Domino-UI-based application.

## Project Setup

### Maven dependency
```xml
<dependency>
  <groupId>org.dominokit</groupId>
  <artifactId>domino-ui-map-addon</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
<dependency>
  <groupId>org.dominokit</groupId>
  <artifactId>domino-ui-map-addon</artifactId>
  <version>1.0-SNAPSHOT</version>
  <classifier>sources</classifier>
</dependency>

```

### Resources

```html
<link href="//cdn.rawgit.com/openlayers/openlayers.github.io/master/en/v[x.x.x]/css/ol.css" rel="stylesheet" type="text/css">
<script src="//cdn.rawgit.com/openlayers/openlayers.github.io/master/en/v[x.x.x]/build/ol.js" type="text/javascript"></script>
```
Replace `[x.x.x]` with the [OpenLayers](http://openlayers.org/ "OpenLayers website") version you want to use.

## Demo application

This [demo](https://github.com/TDesjardins/domino-map-demo) represents a basic sample application with domino-ui-ol-addon usage. 
