# Minecraft S3 Backup

This plugin aims to provide a simple way to backup your PaperMC Minecraft server into an Amazon S3 Bucket.

## Setup

To use it, you need an AWS-Developer account with an IAM user and a S3-Bucket created. Please refer to the Amazon documentation fot this steps.

### Login options

This plugin supports both login to AWS via credentials file or by providing the creditials in the plugin configuration.

If you want to use the plugin configuration file add your IAM account credentials to the config.yaml in the MinecraftS3Bucket

```
access-key-id: <your access-key>
access-key-secret: <your access-key-secret>
bucket: <name of your bucket>
region: <the region your bucket belongs to>
backup-interval: 360

```

The backup-interval configuration defines the minutes between to backups. Leave it emtpy to disable automatic backups.

## Disclaimer

Please keep in mind, that Amazon AWS is a paid service and there will be costs for using it.
