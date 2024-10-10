FROM debian:bookworm

RUN apt-get update && apt-get upgrade -y && apt-get install -y  \
	git-all \
	default-jre \
	maven \
	zsh \
	curl \
	make

WORKDIR /swingy

CMD ["tail", "-f", "/dev/null"]