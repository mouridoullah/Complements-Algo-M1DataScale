# Compl-mentAlgoM1DataScale
# Variables
python permet de créer des variables booléennes, entières,
réelles, chaines de caractère, ... de la manière la plus simple. Pas besoin de connaitre le nom des types, 
celui-ci est défini à l'affectatio

```python
x = 1
type(x)
```
```
int
```
```python
y = 3.1415
type(y)
```
```
float
```
```python
z = True
type(z)
```
```
bool
```
```python
s = 'Hello'
type(s)
```
```
str
```
```python
t = (1 , 1)
type(t)
```
```
tuple
```
```python
a = [ 1, 2, 3 ]
type(a)
```
```
list
```
# Affichage
Afficher le contenu d'une variable s'effectue Affichage
Afficher le contenu d'une variable s'effectue avec la fonctionprint. Le format de sortie peut être maitrisé via la méthode format des chaines de caractères. avec la fonction print. Le format de sortie peut être maitrisé via la méthode format des chaines de caractères.

```python
print(x)
print(y)
```
```
1
3.1415
```
```python
print(x,y,z)
```
```
1 3.1415 True
```
```python
print('{:>10}{:>10}{:>10}'.format('x','y','z'))
print('{:>10}{:>10}{:>10}'.format(x,y,z))
```
```
         x         y         z
         1    3.1415         1
```
Notez que contrairement au C++, le type d'une variable peut changer par affectation. Une variable python est juste un nom qui pointe vers un objet. L'affectation le fait pointer vers un autre objet. Par exemple, pour x qui est jusqu'ici de type int
```python
x = 3.14
type(x)
```
```
float
```
# Décisions
Les décisions en python se font via l'instruction if, elif, else corresponant au if, else if, else du C++. L'expression booléenne testée est suivie de :, la branche de code à exécuter est écrite sur la/les lignes suivantes indentées.
```python
x = 1.4

if x < 0:
    print(x,'est négatif')
elif x == 0:
    print(x,'est nul')
else:
    print(x,'est positif')
```
```
1.4 est positif
```
Notez que la définition des blocs de code se fait par indentation, contrairement au C++ qui utilise les accolades {...}
```python
x = 1.4

if x < 0:
    print(x,'est négatif')
elif x == 0:
    print(x,'est nul')
else:
    print(x,'est positif')
    if x > 2: 
        print('et plus grand que 2')
        print('ça fait beaucoup')
    print('mais pas trop')
1.4 est positif
```
```
mais pas trop
```
# Boucles
python dispose de boucles while et for mais pas de boucle do ... while. La syntaxe des boucles while est quasi identique à celle des décisions ci-dessus
```python
x = -5

while x < 0: 
    print(x)
    x += 1
    
print('fin de boucle: x vaut',x)
```
```
-5
-4
-3
-2
-1
fin de boucle: x vaut 0
```
La boucle for sert uniquement à itérer sur les éléments d'une séquence (tableau, liste, caractères d'une chaine), similairement à la syntaxe for(auto c : s) du C++ par exemple.
```python
s = "Hello"
for c in s:
    print(c)
```
```
H
e
l
l
o
```
Si l'on veut écrire l'équivalent du boucle
```C++
for(int i = 0; i < N; ++i)
```
en C++, il faut créer une séquence contenant les entiers de 0 à N-1. On utilise pour cela range(0,N).
```python
for i in range(0,5):
    print(i,i**2)
```
```
0 0
1 1
2 4
3 9
4 16
```
```python
for i in range(0,10,2):
    print(i,i**3)
```
```
0 0
2 8
4 64
6 216
8 512
```
```python
for i in range(5,0,-1):
    print(i,i**4)
```
```
5 625
4 256
3 81
2 16
1 1
```
# Fonctions
python permet de définir des fonctions avec le mot clé def
```python
def hello(name, loud):
    if loud:
        print('HELLO', name.upper(), '!')
    else:
        print('Hello', name) 

hello('Adam',False)
hello('Bob',True)
```
```
Hello Adam
HELLO BOB !
```
La fonction précédente n'a pas de valeur de retour. Le mot clé return permet d'en retourner une ... ou plusieurs
```python

```
```python
def somme(a,b):
    s = a+b
    return s
x = 1
y = 2
s1 = somme(x,y)
print('somme = ',s1)
```
```
somme =  3
```
```python
def sommeEtDiff(a,b):
    s = a+b
    d = a-b
    return s,d
s2,d2 = sommeEtDiff(x,y)
print('somme = {0} et difference = {1}'.format(s2,d2))
```
```
somme = 3 et difference = -1
```
Les paramètres peuvent avoir des valeurs par défaut
```python
def puissance(exp1,exp2,base=10,step=1):
    for exp in range(exp1,exp2,step):
        print(base**exp)
puissance(0,3)          # exp1 = 0 et exp2 = 3
```
```
1
10
100
```
```python
puissance(0,3,2)        # exp1 = 0, exp2 = 3 et base = 2
```
```
1
2
4
```
Il est aussi possible de passer les paramètres dans le désordre en spécifiant leurs noms.
```python
puissance(0,10,step=3)  # exp1 = 0, exp2 = 10 et step = 3
```
```
1
1000
1000000
1000000000
```
```python
puissance(base=2,exp2=10,exp1=0,step=3)  
```
```
1
8
64
512
```
# Tableaux
Les tableaux les plus utilisés sont de type list, même s'ils sont en pratique mis en oeuvre sous la forme de tableaux redimensionable, similairement à la classe vector en C++.
```python
T = [ 6, 3, 5, 1, 2, 4 ]
print(T)
type(T)
```
```
[6, 3, 5, 1, 2, 4]
list
```
Parcourir tous les éléments du tableau se fait avec la boucle for
```python
for t in T:
    print(t)
```
```
6
3
5
1
2
4
```
On dispose d'un accès par indice avec les crochets []. Parcourir tout les indices du tableau utilise la séquence range vue plus haut et la fonction len qui retourne la taille de la liste
```python
for i in range(0,len(T)):
    T[i] = T[i]**2
print(T)
```
```
[36, 9, 25, 1, 4, 16]
```
Si nécessaire, la fonction enumerate permet un accès simultané aux indices et aux éléments
```python
for i, t in enumerate(T):
    print("T[",i,"] =",t)
```
```
T[ 0 ] = 36
T[ 1 ] = 9
T[ 2 ] = 25
T[ 3 ] = 1
T[ 4 ] = 4
T[ 5 ] = 16
```
Les tableaux sont redimensionables. En particulier on dispose de la méthode append qui correspond à push_back en C++.
```python
T2 = [] 
for t in T:
    T2.append(t+1)
print(T2)
```
```
[37, 10, 26, 2, 5, 17]
```
Mais il y a une syntaxe plus élégante en python pour écrire la boucle ci-dessus. Elle sera utilisée dans ce cours.
```python
T3 = [ t+1 for t in T ]
print(T3)
```
```
[37, 10, 26, 2, 5, 17]
```
Enfin, on peut facilement créer des sous-tableaux en en prenant une tranche (slice)
```python
print(T)
print(T[1:4])
print(T[:2],T[2:])
```
```
[36, 9, 25, 1, 4, 16]
[9, 25, 1]
[36, 9] [25, 1, 4, 16]
```
# Librairies
De très nombreuses librairies étendent les fonctionalités de python. Pour les utiliser, on utilise le mot clé import ou import ... as ... pour la renommer. Dans le cadre de ce cours, nous utiliserons essentiellement la librairie numérique numpy et celle de dessin de graphes 2d matplotlib.
Voyons comment dessiner le graphe d'une fonction sinus.
```python
import numpy as np
import matplotlib.pyplot as plt
    
x = np.linspace(0,10*np.pi,200)   
y = np.sin(x)                      

plt.plot(x,y)               
plt.title('Fonction sinus')
plt.xlabel('x (radians)')
plt.ylabel('y = sin(x)')
plt.show()
```
# Graphes
Une fonction particulièrement utile pour la suite est la possibilité d'afficher des graphes avec des échelles linéaires ou logarithmique pour chacun des axes.
```python
x = np.linspace(0,100,11)
print(x)
```
```
[  0.  10.  20.  30.  40.  50.  60.  70.  80.  90. 100.]
```
```python
x = np.logspace(0,2,11)
print(x)
```
```
[  1.           1.58489319   2.51188643   3.98107171   6.30957344
  10.          15.84893192  25.11886432  39.81071706  63.09573445
 100.        ]
```
```python
x = np.logspace(0,7,50)
y = np.square(x)
z = np.power(x,3)
    
plt.plot(x,x,label='x')
plt.plot(x,y,label='x^2')
plt.plot(x,z,label='x^3',marker='.')
plt.legend()
plt.title('linear')
plt.show()
```
```python
plt.loglog(x,x,label='x')
plt.loglog(x,y,label='x^2')
plt.loglog(x,z,label='x^3',marker='.')
plt.legend()
plt.title('loglog')
plt.show()
```
```python
plt.semilogx(x,x,label='x')
plt.semilogx(x,y,label='x^2')
plt.semilogx(x,z,label='x^3',marker='.')
plt.legend()
plt.title('semilogx')
plt.show()
```
```python
plt.semilogy(x,x,label='x')
plt.semilogy(x,y,label='x^2')
plt.semilogy(x,z,label='x^3',marker='.')
plt.legend()
plt.title('semilogy')
plt.show()
```
# Nombres aléatoires
```python
import random

random.random()           # nombre aléatoire entre 0 et 1
```
```
0.6203232130165383
```
```python
random.randint(0,100)     # entier aléatoire entre 0 et 100 (100 y compris)
```
```
92
```
```python
random.uniform(0,100)     # nombre aléatoire entre 0 et 100, distribution uniforme
```
```
55.40150502304532
```
```python
T = np.random.uniform(0,10,100)    # 100 nombres aléatoires entre 0 et 10

plt.stem(T,markerfmt=',',linefmt='black',basefmt='black')
plt.show()
```
# Classes en python
Le but de cette présentation est de présenter le minimum de syntaxe python nécessaire aux chapitres 4 et suivants de ce cours. Dès lors, ce n'est qu'une présentation très partielle de la partie orientée objet de python.

On peut définir une classe élémentaire selon la syntaxe ci-dessous
```python
class Ma_Classe:
    def __init__(self, param):       
        print("Initialisation")
        self.attribut = param
        self.__attribut_prive = "privé"
        
    def une_methode(self,param):
        print(self.attribut, param)
        
    def une_methode_sans_parametre(self):
        print(self.attribut, "une_methode_sans_parametre")
```
Le premier paramètre de toutes les méthodes est l'objet lui même, i.e. l'instanciation de la classe qui appelle la méthode.
La méthode __init__ correspond au constructeur en C++. Elle est appelée quand on crée un objet et sert à en initialiser les attributs.
```python
mon_objet = Ma_Classe("Hello")
```
```
Initialisation
```
On peut accéder aux attributs de l'objet directement.
```python
print(mon_objet.attribut)
```
```
Hello
```
On peut même accéder aux attributs privés. __NomAttribut est décoré hors de la classe en _NomClasse__NomAttribut.
```python
print(mon_objet._Ma_Classe__attribut_prive)
```
```
privé
```
On peut appeler les méthodes via
```python
mon_objet.une_methode("World")
```
```
Hello World
```
qui est en fait du sucre syntactique sur l'appel de la fonction
```python
Ma_Classe.une_methode(mon_objet,"World")
```
```
Hello World
```
Une méthode n'a pas nécessairement de paramètre
```python
mon_objet.une_methode_sans_parametre()
```
```
Hello une_methode_sans_parametre
```
Toute fonction peut devenir une méthode de la classe de son premier paramètre. Il suffit d'écrire
```python
def une_fonction(obj):
    print(obj.attribut,"une fonction externe")

Ma_Classe.une_autre_methode = une_fonction
mon_objet.une_autre_methode()
```
```
Hello une fonction externe
```
qui, rappelons-le, n'est que du sucre autour de
```python
Ma_Classe.une_autre_methode(mon_objet)
```
```
Hello une fonction externe
```
On peut afficher un objet avec la fonction print, mais le résultat n'est pas très intéressant
```python
print(mon_objet)
```
```
<__main__.Ma_Classe object at 0x107d26b70>
```
Mais on peut customiser l'affichage en définissant la méthode magique __str__ qui doit retourner une string. Par exemple
```python
def maclasse_to_string(obj):
    return "Attribut: {}".format(obj.attribut)

Ma_Classe.__str__ = maclasse_to_string
print(mon_objet)
```
```
Attribut: Hello
```
Il y a de nombreuses autres fonctions magiques, qui permettent entre autre de surcharger les opérateurs. Par exemple, pour émuler les types numériques, on peut surcharger l'opérateur + en définissant __add__(self,other).
Pour les types conteneurs qui nous intéressent dans ce cours d'ASD, on notera entre autres
__len__(self) qui est appelé par la fonction len(Conteneur) et retourne le nombre d'éléments
__getitem__(self) et __setitem__(self,val) qui surchargent l'opérateur [] d'accès indexé
```python
def multiplication_russe(a,b):
    if b == 0: return 0
    else:
        if b % 2 :
            return a + multiplication_russe(a+a,b//2)  
        else: 
            return multiplication_russe(a+a,b//2) 
a = 743
b = 42
print("{} * {} = {} \n".format(a,b,a*b))
multiplication_russe(a,b) 
```
```
743 * 42 = 31206 
```
```python
def reste_division_entiere(a,b):
    assert a >= b and b > 0
    
    if a - b >= b:
        a = reste_division_entiere(a,b << 1) # b*2
        if a < b: return a
    return a-b
reste_division_entiere(743,25)
```
```
```
```python
def puissance(b,n): 
    r = 1
    a = b
    while n > 0:
        if n&1: r = r * a
        a = a * a
        n >>= 1
    return r
for i in range(10):
    print("2^{} = {}".format(i,puissance(2,i)))
```
```
2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8
2^4 = 16
2^5 = 32
2^6 = 64
2^7 = 128
2^8 = 256
2^9 = 512
```
```python
import numpy as np
def fibonacci(n): 
    a = np.array([[0, 1], [1, 1]]) 
    r = np.array([[1, 0], [0, 1]])
    while n > 0:
        if n&1: r = np.matmul(r,a)
        a = np.matmul(a,a)
        n >>= 1
    return r[1,1]
for i in range(10):
    print(fibonacci(i))
```
```
1
1
2
3
5
8
13
21
34
55
```
Le coeur de l'algorithme consiste à échanger deux éléments consécutifs si le second est strictement plus grand que le premier
```python
def echangeSiNecessaire( A, i):        
    # Après cette fonction, A[i] <= A[i+1]    
    if A[i] > A[i+1]:
        A[i], A[i+1] = A[i+1], A[i]    # swap 
```
Appliquons le par exemple aux troisièmes et quatrièmes éléments (d'indices 2 et 3)
```python
T = [ 5, 8, 4, 3, 2, 6, 7, 1 ]; print(T)
echangeSiNecessaire(T,2);       print(T)
echangeSiNecessaire(T,2);       print(T)
```
```
[5, 8, 4, 3, 2, 6, 7, 1]
[5, 8, 3, 4, 2, 6, 7, 1]
[5, 8, 3, 4, 2, 6, 7, 1]
```
```python
def tri_a_bulles(T):
    N = len(T)
    for k in range(N,1,-1):     # N, N-1, ... 2
        for i in range(0,k-1):  # 0, 1, ... k-2 
            if T[i] > T[i+1]:   # T0 < T1 ... Tk-2 < Tk-1
                T[i],T[i+1] = T[i+1],T[i]   # swap
T = [5, 8, 4, 3, 2, 6, 7, 1]
tri_a_bulles(T)
print(T)
```
```
[1, 2, 3, 4, 5, 6, 7, 8]
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```
```python

```
```
```