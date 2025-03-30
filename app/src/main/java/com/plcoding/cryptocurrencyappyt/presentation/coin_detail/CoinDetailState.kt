package com.mharis404.crypto.presentation.coin_detail

import com.mharis404.crypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
