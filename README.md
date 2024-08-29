# Snackbars Example App

This is a simple Android app demonstrating the usage of Snackbars with Jetpack Compose and a custom Snackbar controller. The app showcases two screens: `ScreenA` and `ScreenB`, and demonstrates how to display Snackbars with and without actions.

## Features

- **ScreenA**: Contains buttons to show Snackbars with or without actions and navigate to `ScreenB`.
- **ScreenB**: Displays a simple message.

## Tech Stack

- Jetpack Compose
- Kotlin
- Coroutines
- ViewModel
- SnackbarHost

## Screenshots



## Getting Started

To run this project locally, follow these steps:

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/Bhavyansh03-tech/Snackbars.git
    ```

2. **Open the Project**:
    Open the project in Android Studio.

3. **Build and Run**:
    Click on the "Run" button in Android Studio to build and run the app on an emulator or physical device.

## Code Overview

- **MainActivity**: Sets up the `NavHost` for navigation between `ScreenA` and `ScreenB` and handles Snackbar events.
- **ScreenA**: Displays buttons to show Snackbars and navigate to `ScreenB`.
- **ScreenAViewModel**: Manages Snackbar events with actions.
- **SnackBarController**: Handles sending Snackbar events.
- **ObserveAsEvent**: Custom Composable to observe flows and trigger side effects.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new Pull Request.

## Contact

For questions or feedback, please contact [@Bhavyansh03-tech](https://github.com/Bhavyansh03-tech) on GitHub or connect with me on [LinkedIn](https://www.linkedin.com/in/bhavyansh03/).

---
