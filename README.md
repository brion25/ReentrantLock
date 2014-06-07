ReentrantLock
=============

En este ejemplo utilizo un ArrayBlockingQueue, en el cual simulo el acceso a una fila mediante 2 hilos, podemos ver este ejemplo como una fila para las tortillas:

Cada 1.333s se produce 1 kilo de tortillas y cada 1s llegan 2 personas preguntando por 1 kilo cada una, como cada 1.333s se produce 1 kilo, una de las personas debe de esperar, en cuanto el segundo kilo salga la segunda persona entra al proceso de "paga" forzando a las demas personas a esperar.
