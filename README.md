# Zad3-PPKWU

API służące do sprawdzenia występujących w ciągu znaków i zwraca odpowiednio sformatowane dane.
Sprawdza występowanie dużych i małych znaków,liczb,znaków specjalnych i dowolnych ich kombinacji.
Aby móc skorzystać z aplikacji należy postawić serwer https://github.com/SandersLR-dev/zad2-PPKWU

## Jak stosować
```haml
localhost:8081/JSON/{tutaj wpisujemy text do analizy} - zwracany typ danych to JSON
localhost:8081/XML/{tutaj wpisujemy text do analizy} - zwracany typ danych to XML
localhost:8081/CSV/{tutaj wpisujemy text do analizy} - zwracany typ danych to CSV
```

## Przykład użycia
```haml
JSON

Wysyłamy request na adres aby otrzymac dane w formacie JSON
localhost:8081/JSON/Test 4545 koniec

Wynik:
{
"givenString": "Test 4545 koniec",
"length": 16,
"letter": 10,
"lowerCase": 9,
"upperCase": 1,
"number": 4,
"whiteSpace": 2,
"specialChar": 0
}

XML

Wysyłamy request na adres aby otrzymac dane w formacie XML
localhost:8081/XML/Test 4545 koniec

Wynik:
<root>
<number>4</number>
<givenString>Test 4545 koniec</givenString>
<whiteSpace>2</whiteSpace>
<upperCase>1</upperCase>
<letter>10</letter>
<lowerCase>9</lowerCase>
<specialChar>0</specialChar>
<length>16</length>
</root>

CSV

Wysyłamy request na adres aby otrzymac dane w formacie CSV
localhost:8081/CSV/Test 4545 koniec

Wynik:
number,givenString,whiteSpace,upperCase,letter,lowerCase,specialChar,length
4,Test 4545 koniec,2,1,10,9,0,16

```
