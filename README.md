<h1>Ćwiczenie z Syntezy Mowy</h1>
<p><strong>Autor:</strong> dr inż. Piotr Wrzeciono</p>

<h2>Opis</h2>
<p>Dane są następujące nagrania:</p>
<ul>
    <li>Lista stacji, do których można dojechać z Warszawy Centralnej (katalog <code>stacje</code>).</li>
    <li>Frazy związane z peronami i torami (katalog <code>perony_i_tory</code>).</li>
    <li>Wyrażenia służące do podawania komunikatu o odjeździe lub przyjeździe pociągu (katalog <code>do_z_stacji</code>).</li>
</ul>

<p>Należy pamiętać, że na stacji Warszawa Centralna są cztery perony:</p>
<ul>
    <li>Przy pierwszym peronie są tory 7 oraz 5.</li>
    <li>Przy drugim są tory oznaczone 3 i 1.</li>
    <li>Przy peronie trzecim mamy tory 2 i 4.</li>
    <li>Tor 6 oraz 8 znajdują się przy peronie czwartym.</li>
</ul>
<p>Dlaczego tak jest, można przeczytać na przykład tutaj: <a href="https://magazyn.koleo.pl/numery-torow-i-peronow/">Numery torów i peronów</a>.</p>

<h2>Cel Zadania</h2>
<p>Celem zadania jest napisanie korpuskularnego syntezatora mowy, służącego do zapowiedzi pociągów przyjeżdżających oraz odjeżdżających ze stacji Warszawa Centralna. Student sam wybiera język programowania.</p>

<h2>Działanie Programu</h2>
<ol>
    <li><strong>Wpisanie Tekstu</strong>:
        <p>Przykład: <code>Pociąg ze stacji Warszawa Wschodnia do stacji Poznań Główny przez stacje Kutno, Konin, odjedzie z toru drugiego przy peronie trzecim.</code></p>
    </li>
    <li><strong>Przeszukiwanie Katalogów</strong>:
        <p>Program przeszukuje katalogi z nagraniami i łączy je we właściwą całość. Podpowiedź: Nazwy plików nie zawierają polskich znaków, ale składają się ze wszystkich wyrazów nagranych w danym fragmencie.</p>
    </li>
    <li><strong>Obsługa Błędów</strong>:
        <p>Jeżeli program nie znajdzie właściwego pliku, ma generować odpowiedni komunikat o błędzie.</p>
    </li>
    <li><strong>Generowanie Wyniku</strong>:
        <p>Program może generować dźwięk lub zapisywać wynik do pliku (wedle uznania).</p>
    </li>
</ol>
