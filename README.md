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

## How to use WFP (Version 1.0.0)

As previously stated, WFP is mainly used to define engineering standards (safety, security etc...) for critical systems as general workflows. For this version we have a tool that allows users to define these workflows in a model based environment. We also have syntax for allowing the definition of constraints on these workflows. When the constraints are defined, we can then build arguments that use the constraints as evidence or proof that an argument is true about a system that is developed using the defined workflow.

Upon starting a new model this is what it looks like:
![Starting a model](https://github.com/t-chiang/WorkFlowPlus/blob/master/Documentation/Starting_new_model.png)

On the left side is the project explorer that shows you all of the projects that you have open in your eclipse workspace. In the center is the canvas where you will start creating your model. On the right is the palette that contains all of the model elements available to you for creating a WFP model.

![Palette](https://github.com/t-chiang/WorkFlowPlus/blob/master/Documentation/Palette_elements.png)

Building a model is fairly straight forward, select the element you want to create in the model, then click anywhere in the canvas to drop it. Note that you cannot create references without anything to reference to! Therefore the typical start point is to create some nodes first. Nodes refer to the 'Process' and 'Data' elements available in the palette. Currently you have 3 elements to choose from; Atomic Data, Work Product, Atomic Process. As the name implies, Atomic Data and Atomic Process are invidual elements that are limited in the information that they can contain. Let's start by creating 2 Atomic Data nodes and 1 Atomic Process node. After you drop them in the canvas you can select the 'Create Input' element from the 'Reference Creation' section of the palette. This will allow you to define an input relationship between two nodes. Inputs can only be defined from Data elements to Process elements. The same process is used to create output relationships using the 'Create Output' element. These can only be defined from Process elements to Data elements. After you create all of these elements and move them around, you can make it look something like this:

![First Model](https://github.com/t-chiang/WorkFlowPlus/blob/master/Documentation/First_model.png)

Congratualtions, you have created your first workflow in WFP! For the rest of the reference elements that are available in the palette, they follow the same conventions that are defined in UML. WFP is effectively a UML profile which allows us to leverage already defined syntax and semantics that exist in UML. This also means that we might get similar drawbacks from that notation, but that is something that will continue to be adresses as development for this tool continues.

## How to build arguments in WFP

As previously claimed, the main purpose of WFP is to provide clear repeatable structure to the generation of assurance cases through the definition of standards in a model based environment. This is achieved through the use of constraints and arguments. To activate constraints and arguments for the model, you first have to activate the layer for it. On the top of the canvas window there are several icons that exist. We will refer to these as the canvas toolbar.

![Canvas Toolbar](https://github.com/t-chiang/WorkFlowPlus/blob/master/Documentation/Canvas_toolbar.png)

In order to activate the 'Constraint Argument Layer' you have to select on the layer icon, circled in red, and then select the layer that you wish to activate or deactivate. The activated layers are denoted by the checkmarks on the left of the layer title.

![Activating Layers](https://github.com/t-chiang/WorkFlowPlus/blob/master/Documentation/Activating_layers.png)

After a layer is activated, the palette on the right will update with whatever new elements are now available to be added to the model.

![Updated Palette](https://github.com/t-chiang/WorkFlowPlus/blob/master/Documentation/Updated_palette.png)

Now we can begin to add constraints and arguments to our model. Adding constraints and arguments to our model follows the exact same procedure as adding a node to the model. The references that can be added that are specific to constraints and arguments are also named in the order of source node to target node. That is the first element in the name is the source and the second element in the name is the target.

A simple strucutre for constraints and argumentation could be as follows:

![Constraints and Arguments](https://github.com/t-chiang/WorkFlowPlus/blob/master/Documentation/Constraints_Arguments.png)

The constraints and arguments that are pink in color are syntactic properties of the model while the ones in red are semantic properties of the model. The aim of the syntactic ones are to allow the editor/compiler be able to identify them automatically so that the user doesn't need to evaluate the syntactic qualities of a model, while the semantic ones would need human intervention to judge the semantic quality of the mode.

We can see from how the constraints and arguments are shaped in the example that we follow a similar design pattern to GSN when it comes to assurance case development, but it is much more clear where the evidence comes from and how the argumentation hierarchy can be formed.

## More details about the elements.

Each element that exists in the model has specific properties. These properties list all the information about the element that is selected. These are also found in the properties tab at the bottom of the Eclipse window that contains the project. Currently all of the properties that contain significant information to the user can be found in the 'Semantic' sub-tab under 'Properties'.

![Properties](https://github.com/t-chiang/WorkFlowPlus/blob/master/Documentation/Properties.png)

It is also in this section that we are able to define for our constraints and arguments whether they are semantic or syntactic based on the boolean property that is show in this tab.