To build the package:
- "mvn install" into the root of this folder
- get the marketplace package in nuxeo-adullact-iparapheur-parent/nuxeo-adullact-iparapheur-mp/target
- deploy it through Admin Center
- before the Nuxeo instance restart modify the adullact-security template to add your own certificates
- modify also the nuxeo.conf files to set the following parameters:

nuxeo.adullact.iparapheur.ws.base.url=https://servername/ws-iparapheur
nuxeo.adullact.security.dir=./security  => let that as default
nuxeo.adullact.iparapheur.login=loginForServerLogin
nuxeo.adullact.iparapheur.password=passwordForServerLogin
nuxeo.adullact.iparapheur.keystore.password=passwordForTheKeystore

