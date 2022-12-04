from main import Court
from Stadium import Stadium
court_1 = Court(address='Słoneczna 10, 10-100 Olsztyn', year_built=1999)#1.	Stwórz obiekt o nazwie court_1 i zainicjalizuj go domyślną szerokością i długością.
# Rok budowy i adres jak w punkcie 1.3.1.
print(court_1)
court_2 = Court(500, 500, 'Słoneczna 10, 10-100 Olsztyn', 1999)
print(court_2)
court_3 = Court(100, 50, 'Słoneczna 10, 10-100 Olsztyn', 1999)
court_3.width = 50
court_3.length = 100
print(court_3)
print(court_1.length)#Wypisz na ekran wartość atrybutu length obiektu court_1.
court_1.year_built = 1990	#Zmień wartość atrybutu year_built obiektu court_1 na 1990 i wypisz na ekran reprezentację obiektu court_1 po zmianie stanu.
print(court_1)
print(court_1.area())
court_1.year_built = 2030
print(court_1)
Court.validate(court_1)#Użyj metody statycznej aby zwalidować rok budowy boiska court_1
print(court_1)
print("--------------------------------")
stadium_1 = Stadium(address='Słoneczna 10, 10-100 Olsztyn', year_built=1999,
                    name='Słoneczny stadion', common_name='Słoneczko', capacity=10000)
print(stadium_1)
stadium_2 = Stadium(address='Słoneczna 10, 10-100 Olsztyn', year_built=1999,
                    name='Słoneczny stadion', capacity=10000)
print(stadium_2)
stadium_1.year_built = 2030
print(stadium_1)
Stadium.validate(stadium_1)
print(stadium_1)
print(stadium_1 == stadium_2)
stadium_1.width = 50
stadium_1.length = 100
print(stadium_1 == stadium_2)
print(stadium_1 != stadium_2)
stadium_1.capacity = 500
print(stadium_1 == stadium_2)