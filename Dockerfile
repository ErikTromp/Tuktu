FROM openjdk:8

MAINTAINER Pim Witlox

ENV ACTIVATOR_VERSION 1.3.10
ENV SCALA_VERSION 2.11.8  
ENV SBT_VERSION 0.13.9  
ENV SBT_OPTS -Xmx2G -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -Xss2M  
ENV TUKTU_VERSION 1.2

# install sbt  
RUN wget https://dl.bintray.com/sbt/debian/sbt-$SBT_VERSION.deb  
RUN dpkg -i sbt-$SBT_VERSION.deb  

# install scala  
RUN wget https://downloads.typesafe.com/scala/$SCALA_VERSION/scala-$SCALA_VERSION.deb  
RUN dpkg -i scala-$SCALA_VERSION.deb  

# Download and install Activator
RUN wget --output-document /opt/typesafe-activator-$ACTIVATOR_VERSION.zip http://downloads.typesafe.com/typesafe-activator/$ACTIVATOR_VERSION/typesafe-activator-$ACTIVATOR_VERSION.zip
RUN unzip /opt/typesafe-activator-$ACTIVATOR_VERSION.zip -d /opt
RUN rm -f /opt/typesafe-activator-$ACTIVATOR_VERSION.zip
RUN mv /opt/activator-dist-$ACTIVATOR_VERSION /opt/activator

# Expose port for AKKA communication
EXPOSE 2552

# Expose port for Tuktu UI
EXPOSE 9000
 
# Build our application distribution
RUN /opt/activator/activator dist

# Extract our distribtion
RUN unzip target/universal/tuktu-$TUKTU_VERSION.zip . 

# and.. go!
CMD ["run.sh"]
