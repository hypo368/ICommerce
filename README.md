# ICommerce

## Entities 

L'entité Customer représente les objets de type client. Elle contient les attributs suivants :
- DISCOUNT_CODE : le code de réduction du client
- ZIP : le code postal du client
- NAME : le nom du client
- ADDRESSLINE1 : la première ligne de l'adresse du client
- ADDRESSLINE2 : la deuxième ligne de l'adresse du client
- CITY : la ville du client
- STATE : l'état du client
- PHONE : le numéro de téléphone du client
- FAX : le numéro de fax du client
- EMAIL : l'adresse mail du client
- CREDIT_LIMIT : la limite de crédit du client

Celle-ci est **liée** à la base de données. 


## Service

Le service CustomerService permet de gérer les clients. 
Il contient les méthodes suivantes :

- getAllCustomers : permet de récupérer la liste de tous les clients
- getCustomerById : permet de récupérer un client par son identifiant
- update : permet de mettre à jour un client
- delete : permet de supprimer un client
- persist : permet de créer un client


Ainsi, les méthodes de ce service peuvent être appelées depuis les pages xhtml de 
primefaces pour gérer les clients. 

*Ce sont les méthodes de ce service qui réalisent les opérations CRUD (Create, Read, Update, Delete) sur les clients.*

## Pages Web 

Le site possède 4 pages :
- CustomerList.xhtml : 
Permet de lister tous les clients, ainsi que de naviguer vers les autres pages.
Cette page fait appel a la méthode *getAllCustomers* du service *CustomerService* pour
récupérer la liste des clients et les afficher dans un tableau.
````xhtml
<h:form >
    <p:menubar>
        <p:submenu label="Clients">
            <p:menuitem value="Liste des clients" outcome="listClients" />
            <p:menuitem value="Ajouter un client" outcome="addClient" />
        </p:submenu>
    </p:menubar>
    <p:dataTable value="#{customerManager.allCustomers}" var="customer">
        <!-- Affiche le tableau contenant la liste des customer -->
    </p:dataTable>
</h:form>
````

- CustomerCreate.xhtml : 
Permet de créer un client en remplissant un formulaire, faisant appel a la
méthode *persist* du service *CustomerService* pour ajouter le client
à la base de données.
````xhtml
<h:form>
    <p:inputText value="#{customerManager.newCustomer.name}" />
    <!-- possibilité d'ajouter plus de champ lors de la création -->
    
    <p:commandButton value="Créer" action="#{customerManager.persist}" />
</h:form>
````

- CustomerUpdate.xhtml : 
Permet de mettre à jour un client en remplissant un formulaire, faisant appel a la
méthode *update* du service *CustomerService* pour modifier le client.
````xhtml
<h:form>
    <p:inputText value="#{customerManager.selectedCustomer.name}" />
    <!-- Possibilité d'ajouter plus de champ à modifier -->
    
    <p:commandButton value="Mettre à jour" action="#{customerManager.updateCustomer}" />
</h:form>
````

- CustomerDetail.xhtml : 
Permet de voir les détails d'un client, ainsi que de le supprimer, faisant appel a la
méthode *delete* du service *CustomerService* pour supprimer le client.
````xhtml
<h:form>
    <h:outputText value="ID: #{customerManager.selectedCustomer.id}" /><br/>
    <!-- Possibilité d'afficher plus d'informations sur le client -->

    <!-- Bouton pour supprimer le client -->
    <h:commandButton value="Supprimer" action="#{customerManager.deleteCustomer}" />
</h:form>
````

**Il y a un problème d'importation de PrimeFaces de mon coté, il faudrait réussir à l'intégrer au projet.
Puis, il y a deux choix : on peut utiliser les pages .xhtml, ou bien refaire des pages .jsp.**

**À voir lequel marche le mieux et lequel on arrive à intégrer.**

