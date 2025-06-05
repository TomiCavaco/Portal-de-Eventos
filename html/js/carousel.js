document.addEventListener('DOMContentLoaded', function() {
    const carousels = document.querySelectorAll('.carousel');
    carousels.forEach(carousel => {
        const nextBtn = carousel.querySelector('.next-btn');
        const prevBtn = carousel.querySelector('.prev-btn');
        const imagesContainer = carousel.querySelector('.carousel-images');
        const images = carousel.querySelectorAll('.carousel-images img');
        let currentIndex = 0;
        let clickCount = 0; // Contador de clics

        function updateCarousel() {
            const offset = -currentIndex * 100;
            imagesContainer.style.transform = `translateX(${offset}%)`;
        }

        function resetCarousel() {
            currentIndex = 0;
            clickCount = 0;
            updateCarousel();
        }

        nextBtn.addEventListener('click', function() {
            clickCount++;
            currentIndex = (currentIndex + 1) % images.length;
            updateCarousel();
            if (clickCount >= 2) {
                resetCarousel();
            }
        });

        prevBtn.addEventListener('click', function() {
            clickCount++;
            currentIndex = (currentIndex - 1 + images.length) % images.length;
            updateCarousel();
            if (clickCount >= 2) {
                resetCarousel();
            }
        });

        updateCarousel();
    });
});