package com.baixing.search.geli.Environment

import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.{SparkConf, SparkContext}

/**
 * Created by abzyme-baixing on 14-11-12.
 */
object Env {
	private var sc : SparkContext = null
	private var conf : SparkConf = null

	def sparkContext() : SparkContext = {
		if (sc == null)
			sc = new SparkContext(conf)
		sc
	}

	def sparkConf() : SparkConf = {
		if (conf == null)
			conf = new SparkConf()
		conf
	}

	def hiveContext() : HiveContext = {
		new HiveContext(sc)
	}

	def init(args : Array[String]): Unit = {
		sparkConf()
		sparkContext()
	}
}

