package com.mharis404.crypto.data.repository

import com.mharis404.crypto.data.remote.CoinPaprikaApi
import com.mharis404.crypto.data.remote.dto.CoinDetailDto
import com.mharis404.crypto.data.remote.dto.CoinDto
import com.mharis404.crypto.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}