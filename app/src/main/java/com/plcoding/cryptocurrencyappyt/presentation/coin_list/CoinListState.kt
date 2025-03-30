package com.mharis404.crypto.presentation.coin_list

import com.mharis404.crypto.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
