package com.plcoding.cleanarchformvalidation.domain.use_case

data class ValidationResult(
    // validation
    val successful: Boolean,
    // message only exists if validation failed
    val errorMessage: String? = null
)
