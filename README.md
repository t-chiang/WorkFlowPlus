# WorkFlowPlus (WFP)
Workflow+ is a framework developed at McMaster University for the purpose of generating and maintain safety assurance cases. This repo contains the iteration of this framework developed in the Eclipse Modeling Framework (EMF) and implemented using Sirius. 

## Getting started

In order to get started you must have Eclipse installed, along witht he following plugins: EcoreTools, EMF, and Sirius. These can be installed from the Eclipse marketplace. After you have them installed, navigate to the update site folder, either from the browser or through the repo after cloning. Once you have the update site files, located in the org.mcmaster.workflowplus.updatesite project, you can install the software as a plugin to your eclipse instance. 

To install WFP as a pluging navigate to the help tab at the top toolbar in eclipse. Click it and then select 'install new software'. Next navigate in the dialog window to where the project folder is located in your local machine. Follow the dialog options and you can install the plugin. 

In order to create a new project using the Sirius Modeling Project. Then right click on the project title and select New -> file. Then select the WFP metamodel and you are off to the races.

## Opening as a developer
If you want to open the project in developer mode, open all of the metamodel files and the instance specification file in the project explorer of eclipse. Then open the wfp.ecore graphical representation. Then right click anywhere in the blank space and navigate to generate and click on all. This will generate all of the files necessary to run the Sirius instance. 

Now create a new eclipse runtime application using the default settings. Once the new eclipse window is open, create a new modeling project. Then to create a new file right-click on the project and navigate to the 'other' tab. After you click on it you will be presented with a new window with many options for a file. Search for the wFP_V2 model and select it. This will create a new modeling file for you to use. In order to start the graphical representation of the model, navigate to the .aird file and enable wFP_V2 as a graphical representation. This will allow you to open the Sirius editor for creating WF+ models and get started on specifying your safety engineering practices.

## What is WFP?

WFP is a domain specific modeling language for the purpose of domain workflows and/or standards to then extract an assurance case on a product. The main goal is to provide direct traceability fron an assurance case to the processes and data that make up the argumentation for the claims and the decomposition, and the evidence that comes from the data that is produced. This allows for assurance cases to be generated with a clear strucutre and decomposition that comes directly from the standards that guide the development and the workflows that implement the standards.

## How to use WFP (Version 1.0.0)?

As previously stated, WFP is mainly used to define engineering standards (safety, security etc...) for critical systems as general workflows. For this version we have a tool that allows users to define these workflows in a model based environment. We also have syntax for allowing the definition of constraints on these workflows. When the constraints are defined, we can then build arguments that use the constraints as evidence or proof that an argument is true about a system that is developed using the defined workflow.

Upon starting a new model this is what it looks like:
![](**\Documentation\Starting_new_model.png)
