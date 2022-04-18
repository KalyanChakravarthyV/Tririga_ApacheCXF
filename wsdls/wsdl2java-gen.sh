#!/usr/bin/env bash

# Refer https://github.com/KalyanChakravarthyV/TransformWSDL.git

transform_wsdl -i wsdls/TririgaWS.wsdl -o wsdls/UpdatedTririgaWS.wsdl

# For more info refer https://cxf.apache.org/docs/wsdl-to-java.html
echo "Generating java code from the updated wsdl"

# Download from http://cxf.apache.org/
wsdl2java -autoNameResolution -b wsdls/binding.xjb -d src/main/java   wsdls/UpdatedTririgaWS.wsdl
