package com.mharis404.crypto.domain.repository

import com.mharis404.crypto.data.remote.dto.CoinDetailDto
import com.mharis404.crypto.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}