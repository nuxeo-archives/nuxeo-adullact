What is this new project:

  Target of this new plugin is to integrate nuxeo with iParapheur of Adullact company.
This project implements a service that exposes method that is connected to iParapheur
through web service. You have also operations that you can used into your automation chains
and Seam component that exposes the Nuxeo Service.

Regenerating objects from wsdl file:
 - copy the new wsdl file into ${project.dir}/src/main/wsdl/
 - execute "mvn clean axistools:wsdl2java"
 - you will have the generated source target/generated-sources/
 - you can dispatch this code into src/main/java/ 
    
Install this plugin
 - execute "mvn install"
 - copy the generated jar into target/ into the nxserver/bundles nuxeo tomcat server
 - add through a specific template or directly into the nxserver/nuxeo.properties the following properties
 
nuxeo.adullact.iparapheur.webservice.base.url => you can specify the base url for web services ex: https://iparapheur.demonstrations.adullact.org/ws-iparapheur
nuxeo.adullact.ipararpheur.truststore.path    => truststore where you will have the certificate of authority (delivered by adullact)
nuxeo.adullact.iparapheur.truststore.type     => truststore type (by default JKS)
nuxeo.adullact.iparapheur.login               => login used to execute actions into iParapheur server (delivered by adullact)
nuxeo.adullact.iparapheur.password            => password of previous account (delivered by adullact)
nuxeo.adullact.iparapheur.keystore.path       => certificate used to establish the connexion with the web service API 
nuxeo.adullact.iparapheur.keystore.password   => password of the keystore (must be the same of the certificate content into it)

And so, you must copy the jks files somewhere (ex into ${tomcat}/)
 - trust.jks
 - bjalon.jks (you can generete from the .p12 file with anytools that manage this kind of files 
Into the "src/test/adullact/" folder of this project, you will have resources given by adullact for our tests.

Here is an Example of what you can add into your properties 
nuxeo.adullact.iparapheur.webservice.base.url=https://iparapheur.demonstrations.adullact.org/ws-iparapheur
nuxeo.adullact.ipararpheur.truststore.path=${tomcat}/trust.jks
nuxeo.adullact.iparapheur.truststore.type=JKS
nuxeo.adullact.iparapheur.login=webservice@nuxeo.com
nuxeo.adullact.iparapheur.password=webservice123
nuxeo.adullact.iparapheur.keystore.path=${tomcat}/key.jks
nuxeo.adullact.iparapheur.keystore.password=myPassword

The p12 file will be used by the client into his browser to sign content into iParapheur