# Adapter Pattern for Language Translation Integration
## Problem Statement
You are developing a language translation tool that needs to integrate with different translation services like Google Translate, Microsoft Translator, and Yandex.Translate. Each service offers its own API and response format, making integration complex. To simplify this process and ensure consistency in the codebase, you decide to implement the Adapter pattern. This pattern allows you to create adapter classes for different translation services, converting their APIs into a common format that your application can work with.

### Assignment
Your task is to implement the Adapter pattern to create adapter classes for different translation service APIs. These adapters should adhere to the TranslationProviderAdapter interface, which defines common methods for translation and fetching supported languages. The goal is to abstract away the differences in APIs and data formats, providing a unified interface for your language translation tool.

### Implementing the Adapter Pattern
Review the existing translation services: Study the APIs and response formats of the translation services you need to integrate with. Understand how each service's API works and the data it provides.

Implement the adapter interface: You have been provided with a TranslationProviderAdapter interface. Your task is to create adapter classes for each translation service that implements this interface. These adapters should adapt the specific translation service's API into a format that matches the methods defined in the TranslationProviderAdapter.

Use composition: Create adapter classes that internally use instances of the actual translation service APIs, such as GoogleTranslateApi and MicrosoftTranslateApi. Avoid modifying the provider APIs directly; instead, create methods in the adapter classes that map to the provider APIs and perform the necessary data transformations.

Additional method: Apart from the translate method, you should implement another method as required by the assignment.

Test your implementation: Execute the provided test cases in the TranslationProviderAdapterTest class to validate the correctness of your adapter classes. These test cases will ensure that your adapters have the required methods and interact with the provider APIs properly