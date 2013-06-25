# Adullact WebDelib integration

This Project contains all resources to activate Adullact WebDelib Integration.
Configuration is based on the parsing service and Studio configuration.
If you changed the default WebDelib configuration you will have to work on this elements.

To build the package:

- "mvn install" into the root of this folder
- get the marketplace package in nuxeo-adullact-webdelib-parent/nuxeo-adullact-webdelib-mp/target
- deploy it through Admin Center
- modify also the nuxeo.conf files to set the following parameters:
