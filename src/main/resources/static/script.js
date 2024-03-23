const carousel = document.querySelector('.carousel');
    const images = document.querySelectorAll('.carousel img');
    const interval = 1800; // Intervalo de tempo entre as transições (em milissegundos)
    let index = 0;

    setInterval(() => {
        index++;
        if (index >= images.length) {
            index = 0;
        }
        carousel.style.transform = `translateX(-${index * 100}%)`;
    }, interval);